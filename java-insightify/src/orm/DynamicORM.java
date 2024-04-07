package orm;

import java.sql.Connection;
import java.sql.DriverManager;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;

public class DynamicORM<T> extends ORM<T> {

    private String defaultFileName = "dynamic-connection.txt";

    private String getFilePath() throws Exception {
        File currentDir = new File(System.getProperty("user.dir")); // Le répertoire de travail actuel
        List<File> foundFiles = new ArrayList<>();
        searchFile(currentDir, defaultFileName, foundFiles); // Commencer la recherche
        if (!foundFiles.isEmpty()) {
            // Retourner le chemin du premier fichier trouvé
            return foundFiles.get(0).getAbsolutePath();
        } else {
            throw new Exception("Aucun fichier de configuration depuis : " + currentDir.getAbsolutePath());
        }
    }

    // Méthode récursive pour rechercher le fichier dans le répertoire donné et ses
    // sous-répertoires
    private void searchFile(File directory, String fileName, List<File> foundFiles) {
        if (directory.isDirectory()) {
            File[] files = directory.listFiles();
            if (files != null) {
                for (File file : files) {
                    if (file.isDirectory()) {
                        searchFile(file, fileName, foundFiles); // Appel récursif pour les sous-répertoires
                    } else if (file.getName().equals(fileName)) {
                        foundFiles.add(file); // Ajouter le fichier trouvé à la liste
                    }
                }
            }
        }
    }

    private String readFromFile() throws Exception {
        StringBuilder content = new StringBuilder();

        try (BufferedReader br = new BufferedReader(new FileReader(getFilePath()))) {
            String line;
            while ((line = br.readLine()) != null) {
                content.append(line).append("\n");
            }
        }
        return content.toString();
    }

    private Connection connection() throws Exception {
        String fileContent = readFromFile();
        List<String> lst = getLinesFromString(fileContent);
        String url = null, password = null, user = null;
        for (String string : lst) {
            if (string.contains("url")) {
                url = string.split("=")[1];
                url = url.trim();
            } else if (string.contains("password")) {
                password = string.split("=")[1];
                password = password.trim();
            } else if (string.contains("user")) {
                user = string.split("=")[1];
                user = user.trim();
            }
        }
        if (url == null || password == null || user == null)
            throw new Exception("dynamic-connection.txt is incorrect");

        return DriverManager.getConnection(url, user, password);
    }

    // Méthode pour obtenir les lignes d'une chaîne de caractères
    private List<String> getLinesFromString(String content) {
        List<String> lines = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new StringReader(content))) {
            String line;
            while ((line = reader.readLine()) != null) {
                lines.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace(); // Gérer l'exception selon votre cas
        }
        return lines;
    }

    public T[] select() throws Exception {
        return select(connection(), false);
    }

    public T[] select(String specialQuery) throws Exception {
        return select(connection(), false, specialQuery);
    }

    public T[] selectWhere(String where) throws Exception {
        return selectWhere(connection(), false, where);
    }

    public void insert() throws Exception {
        insert(connection(), false);
    }

    public void deleteWhere(String where) throws Exception {
        deleteWhere(connection(), false, where);
    }

    public void update(String condition) throws Exception {
        update(connection(), false, condition);
    }

    public T[] selectPagination(Integer pageNumber, Integer elementsPerPage) throws Exception {
        return select(connection(), pageNumber, elementsPerPage, false);
    }

    public T[] selectPaginationWhere(String condition, Integer pageNumber, Integer elementsPerPage)
            throws Exception {
        return selectWhere(connection(), pageNumber, elementsPerPage, false, condition);
    }

    public T[] selectPaginationSpecialQuery(String query, Integer pageNumber, Integer elementsPerPage)
            throws Exception {
        return selectWhere(connection(), pageNumber, elementsPerPage, false, query);
    }

    public void updateById() throws Exception {
        updateById(connection(), false);
    }
}
