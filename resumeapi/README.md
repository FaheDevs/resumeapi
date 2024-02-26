
launch an image of the postgres db : 

```
 sudo docker run -d   --name postgres-jwt-security   -e POSTGRES_DB=jwt_security   -e POSTGRES_USER=username   -e POSTGRES_PASSWORD=password   -p 5432:5432   postgres
```

stop the image :

```
sudo docker ps
sudo docker stop postgres-jwt-security
```

TODO : 
- before adding a comment email for verification (resend) , validation from the email for the comment to be posted , make a comments page on github pages.
- fix the controllers and services.
- populating methods , make endpoints for them and don't make them accessible in the security filter.