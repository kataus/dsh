docker run --rm --name pg-docker \
-e POSTGRES_PASSWORD=pwd \
-e POSTGRES_USER=usr \
-e POSTGRES_DB=dshDB \
-p 5432:5432 \
postgres:12