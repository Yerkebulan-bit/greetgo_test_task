# greetgo_test_task_eschool
A test task for applying for a job at "greetgo"

#Требования 
Java - 1.8.x
Maven - 3.x.x
Mysql - 8.x.x

#Шаги по настройке
1) Клонируйте приложение 
git clone https://github.com/Yerkebulan-bit/greetgo_test_task_eschool.git

2) Создайте базу данных MySQL, для этого запустите скрипт queries.sql прикрепленный к проекту

3) Замените имя пользователя и пароль в файле на ваши собственные
   - откройте src/main/java/resources/mybatis-config.xml
   - замените username и password на ваши данные

4) Соберите и запустите ваш проект при помощи Maven
  mvn package
  
5) Перейдите по адресу в браузере http://localhost:8080/

6) Введите пароль(admin) и логин(admin)
