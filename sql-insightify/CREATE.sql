create table personnalite(
    id serial primary key,
    personnalite varchar (250) unique
);

create table questions(
    id serial primary key,
    questions text unique
);

create table reponsesparquestion(
    id serial primary key,
    reponses text unique,
    questionsid integer ,
    foreign key  (questionsid) references questions(id) 
);

-- view qui relie une question avec ses reponses possible
-- avec la colonne question

create or replace view questionreponses as
    select questions, reponses from questions join
    reponsesparquestion on questions.id = reponsesparquestion.questionsid ;

create table notesparreponseparpersonnalite (
    id serial primary key,
    reponsesparquestion integer ,
    personnalite integer,
    note double precision , -- a le mettre de 0 a 1 avec des virgules pour faciliter les choses
    foreign key (reponsesparquestion) references reponsesparquestion(id),
    foreign key (personnalite) references personnalite(id)
);

create or replace view Complet0notesparreponseparpersonnalite as
    select reponsesparquestion , personnalite , max(note) as note from (
        select reponsesparquestion, personnalite , note from notesparreponseparpersonnalite
        union all  select reponsesparquestion.id as reponsesparquestion , personnalite.id as personnalite , 0 as note from personnalite  cross join reponsesparquestion
    ) AS smth group by reponsesparquestion , personnalite
;

create or replace view Completnotesparreponseparpersonnalite as 
    select reponsesparquestion , personnalite.personnalite as personnalite , note from
        Complet0notesparreponseparpersonnalite
        join personnalite on Complet0notesparreponseparpersonnalite.personnalite = personnalite.id

