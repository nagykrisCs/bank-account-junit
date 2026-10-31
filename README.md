# bank-account-junit



BANKACCOUNT - BANKSZÁMLA KEZELŐ (JUnit 5)

Projekt leírása:

A projekt célja egy egyszerű bankszámla
megvalósítása Java programozási nyelven.

A BankAccount osztály lehetővé teszi
a pénz befizetését, felvételét és
az aktuális egyenleg lekérdezését.

A számla induló egyenlege 0.


Használt technológiák:

- Java 17
- JUnit 5 tesztkeretrendszer
- Maven
- Git verziókezelés
- GitHub
- GitHub Actions


Megvalósított metódusok:

deposit(double amount)
- Növeli a számla egyenlegét a megadott összeggel.
- Csak pozitív összeget fogad el.
- Hibás összeg esetén kivételt dob.

withdraw(double amount)
- Csökkenti a számla egyenlegét.
- Csak pozitív összeget fogad el.
- Nem engedi az egyenlegnél nagyobb összeg felvételét.
- Hibás művelet esetén kivételt dob.

getBalance()
- Visszaadja az aktuális egyenleget.


Hibakezelés:

A program IllegalArgumentException kivételt dob,
ha a megadott összeg érvénytelen.

Érvénytelen műveletek:

- Negatív összegű befizetés
- Nulla összegű befizetés
- Negatív összegű pénzfelvétel
- Nulla összegű pénzfelvétel
- Az egyenlegnél nagyobb összeg felvétele
- NaN vagy Infinity érték használata

Sikertelen művelet esetén a számla
egyenlege változatlan marad.


Projekt felépítése:

pom.xml
- Maven konfiguráció és JUnit 5 függőségek.

src/main/java/BankAccount.java
- A bankszámla működésének megvalósítása.

src/test/java/BankAccountTest.java
- A JUnit 5 egységtesztek.

.github/workflows/tests.yml
- A tesztek automatikus futtatása GitHub Actions segítségével.

README.md
- A projekt dokumentációja.


Tesztelés:

A projekt 10 JUnit 5 egységtesztet tartalmaz.

A tesztek a következő eseteket ellenőrzik:

1. Új számla induló egyenlege 0.
2. deposit(1000) után az egyenleg 1000.
3. Több befizetés megfelelően összeadódik.
4. A pénzfelvétel csökkenti az egyenleget.
5. A teljes egyenleg felvehető.
6. Túl nagy összeg felvétele kivételt dob.
7. Negatív befizetés kivételt dob.
8. Nulla összegű befizetés kivételt dob.
9. Negatív pénzfelvétel kivételt dob.
10. Nulla összegű pénzfelvétel kivételt dob.

A hibás műveleteket vizsgáló tesztek
azt is ellenőrzik, hogy az egyenleg
sikertelen művelet után változatlan marad.


Futtatás és tesztelés:

A projekt futtatásához szükséges:

- Java 17 JDK
- Maven

A repository letöltése után a projekt
főkönyvtárában futtassuk a következő parancsot:

mvn test

A Maven automatikusan lefordítja a programot,
majd lefuttatja a JUnit 5 teszteket.


GitHub Actions:

A projekt GitHub Actions segítségével
automatikusan futtatja a teszteket.

A workflow minden push és pull request
esetén elindul.

A tesztelés manuálisan is elindítható
a GitHub Actions felületén.

A tesztek eredménye az Actions fülön
ellenőrizhető.

A végleges projekt tesztfuttatása sikeres volt.


Fejlesztési folyamat:

A program fokozatosan készült el,
külön Git commitok segítségével.

A fejlesztés főbb lépései:

1. Projekt inicializálása.
2. Maven és JUnit 5 beállítása.
3. Az első teszt elkészítése.
4. A kezdőegyenleg megvalósítása.
5. A befizetés tesztelése és implementálása.
6. Több befizetés ellenőrzése.
7. Érvénytelen befizetések kezelése.
8. A pénzfelvétel megvalósítása.
9. Érvénytelen pénzfelvételek tesztelése.
10. A pénzfelvétel ellenőrzésének megvalósítása.
11. A kód szerkezetének javítása.
12. GitHub Actions beállítása.
13. Maven konfiguráció javítása.
14. Projekt dokumentációjának véglegesítése.


Összegzés:

A BankAccount osztály megfelel a feladat
funkcionális követelményeinek.

A program támogatja a befizetést,
a pénzfelvételt és az egyenleg lekérdezését.

Az érvénytelen műveleteket kivételekkel kezeli,
és biztosítja, hogy sikertelen művelet esetén
az egyenleg változatlan maradjon.

A működést 10 JUnit 5 egységteszt ellenőrzi.

A GitHub Actions automatikusan futtatja
a teszteket, így a projekt IDE használata
nélkül is ellenőrizhető.

