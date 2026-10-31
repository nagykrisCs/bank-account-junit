# bank-account-junit


Projekt leírása:

A projekt célja egy egyszerű bankszámla
megvalósítása Java programozási nyelven.

A BankAccount osztály lehetővé teszi
a pénz befizetését, felvételét és
az aktuális egyenleg lekérdezését.

A számla induló egyenlege 0.


Használt technológiák:

- Java
- JUnit 5
- Maven
- Git
- GitHub


Megvalósítandó metódusok:

deposit(double amount)
- Pénz befizetése a számlára.

withdraw(double amount)
- Pénz felvétele a számláról.

getBalance()
- Az aktuális egyenleg lekérdezése.


Követelmények:

- A számla induló egyenlege 0.
- A befizetés növeli az egyenleget.
- A pénzfelvétel csökkenti az egyenleget.
- Negatív vagy nulla összeg nem engedélyezett.
- Nem lehet több pénzt felvenni,
  mint az aktuális egyenleg.
- Hibás művelet esetén
  IllegalArgumentException kivételt kell dobni.
- Sikertelen művelet után
  az egyenleg nem változhat.


Tesztelés:

A projekt JUnit 5 egységteszteket használ.

A tesztek ellenőrzik a bankszámla
működését és a hibás műveletek kezelését.

A tesztek Maven segítségével futtathatók:

mvn test

A tesztek automatikus futtatásához
GitHub Actions is használható.


Projekt állapota:

1.0 - Projekt inicializálása.

A következő lépés a Maven és JUnit 5
tesztkörnyezet beállítása.
