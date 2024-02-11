-- ### One-to-One (Bir-Bire) Iliski

-- Ornek: Bir kullanicinin bir profil bilgisi olabilir.

CREATE TABLE kullanici
(
    kullaniciId SERIAL PRIMARY KEY,
    kullaniciAd varchar(15) not null UNIQUE
);

CREATE TABLE profil
(
    profilId    SERIAL PRIMARY KEY,
    kullaniciId INT,
    ad          varchar(20),
    soyad       varchar(20),
    FOREIGN KEY (kullaniciId) REFERENCES kullanici (kullaniciId)
);

INSERT INTO kullanici (kullaniciAd)
values ('kullanici5');
SELECT *
FROM kullanici;

INSERT INTO profil (kullaniciId, ad, soyad)
values (1, 'mehmet', 'a');


-- +------------+-------------+


-- ### One-to-Many (Bir-Cok) Iliski

-- Ornek: Bir kitabin birden fazla yorumu olabilir.

CREATE TABLE kitap
(
    kitapId SERIAL PRIMARY KEY,
    ad      VARCHAR,
    yazar   VARCHAR
);

CREATE TABLE yorum
(
    yorumId    SERIAL PRIMARY KEY,
    kitapId    INT,
    yorumMetni TEXT,
    FOREIGN KEY (kitapId) REFERENCES kitap (kitapId)
);

INSERT INTO kitap(ad, yazar)
VALUES ('Kitap1', 'Yazar1');

SELECT *
FROM kitap;

INSERT INTO yorum(kitapId, yorumMetni)
VALUES (1, 'Harika!!'),
       (1, 'Cok begendim');

SELECT *
FROM yorum;


-- +------------+-------------+


-- ### Many-to-Many (Cok-Cok) Iliski

-- Ornek: Bir ogrenci birden fazla ders alabilir ve bir ders birden fazla ogrenciye sahip olabilir.

CREATE TABLE ogrenci
(
    ogrenciId SERIAL PRIMARY KEY,
    ad        VARCHAR,
    soyad     VARCHAR
);

CREATE TABLE ders
(
    dersId SERIAL PRIMARY KEY,
    dersAd VARCHAR
);

CREATE TABLE ogrenci_ders
(
    ogrenciId INT,
    dersId    INT,
    PRIMARY KEY (ogrenciId, dersId),
    FOREIGN KEY (ogrenciId) REFERENCES ogrenci (ogrenciId),
    FOREIGN KEY (dersId) REFERENCES ders (dersId)
);

INSERT INTO ogrenci(ad, soyad)
VALUES ('Mete', 'G'),
       ('Buse', 'F');

SELECT *
FROM ogrenci;

INSERT INTO ders(dersAd)
VALUES ('Mat101'),
       ('Fizik101');

SELECT *
FROM ders;

INSERT INTO ogrenci_ders(ogrenciId, dersId)
VALUES (1, 1),
       (1, 2),
       (2, 1);

SELECT *
FROM ogrenci_ders;
