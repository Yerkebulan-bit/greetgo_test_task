# greetgo_test_task_eschool
A test task for applying for a job at "greetgo"

# Требования 
- Java - 1.8.x
- Maven - 3.x.x
- Mysql - 8.x.x
- Apache Tomcat - 9.x.x
- IDE: IntellIJ Idea

# Шаги по настройке
1) Клонируйте приложение <br/>
<i>git clone https://github.com/Yerkebulan-bit/greetgo_test_task_eschool.git</i>

2) Создайте базу данных MySQL, для этого запустите скрипт queries.sql прикрепленный к проекту

3) Замените имя пользователя и пароль в файле на ваши собственные
   - откройте src/main/java/resources/mybatis-config.xml
   - замените username и password на ваши данные

4) Запустите проект в IntellIJ Idea

5) Настройте сервер(Apache Tomcat 9):
   - artifact: <i>greetgo_test_task:war exploded</i>
   - поле 'application context' сделайте пустым
  
6) Запустите приложение 

7) Перейдите по адресу в браузере <i>http://localhost:8080/</i>

8) Введите пароль(admin) и логин(admin)

9) Вы должны увидеть таблицу со студентами, также вы можете добавить нового студента или удалить уже имеющегося

10) Чтобы запустить тест, введите в консоли IDE команду mvn test
