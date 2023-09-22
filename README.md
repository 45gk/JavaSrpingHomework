# JavaSrpingHomework

# git clone https://github.com/45gk/JavaSrpingHomework.git

Сборка с использованием Maven:

Откройте командную строку Windows.

Перейдите в корневую директорию вашего проекта, где находится файл pom.xml.

Выполните команду сборки Maven:

go
Copy code
mvn clean package
Эта команда выполнит сборку проекта, и сгенерирует JAR-файл в директории target.

Сборка с использованием Gradle:

Откройте командную строку Windows.

Перейдите в корневую директорию вашего проекта, где находится файл build.gradle.

Выполните команду сборки Gradle:

Copy code
gradlew build
Если Gradle уже установлен на вашем компьютере, эта команда выполнит сборку проекта, и сгенерирует JAR-файл в директории build/libs.


Запустите JAR-файл: Используйте команду java -jar, чтобы запустить ваш JAR-файл. Убедитесь, что вы замените имя-вашего-файла.jar на фактическое имя вашего JAR-файла:
Copy code
java -jar имя-вашего-файла.jar
