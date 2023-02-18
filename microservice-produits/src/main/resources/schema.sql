create table paiement
(
    id           integer not null,
    id_commande  integer,
    montant      integer,
    numero_carte bigint,
    primary key (id)
)
