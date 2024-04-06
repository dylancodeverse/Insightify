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

