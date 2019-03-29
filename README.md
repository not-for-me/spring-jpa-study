# Spring Data JPA

## Setup
```bash
docker run -p 23306:3306 --name springboot-jpa-study \
-e MYSQL_ROOT_PASSWORD=1234 -e MYSQL_USER=jpa \
-e MYSQL_PASSWORD=1234 -e MYSQL_DATABASE=springboot -d mysql:5.7
```

```bash
docker exec -i -t springboot-jpa-study bash
```
