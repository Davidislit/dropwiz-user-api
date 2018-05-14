# DropwizUserApi

How to start the DropwizUserApi application
---

1. Run `mvn clean install` to build your application
2. Start application with `java -jar target/DropwizUserApi-1.0-SNAPSHOT.jar server config.yml`
3. To check that your application is running enter url `http://localhost:8080`
4. 'user/get' Show all the users.
5. 'user/get/sorted' Show all the users sorted by their User name.
6. 'user/add' POST request to add users, JSON template:
{"id":"1","userName":"User","firstName":"First","lastName":"Last"}

---
