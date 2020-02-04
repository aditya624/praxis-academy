# Latihan 1
## 1. Getting Started
Pada vs code ```ctrl+shift+P``` ketikan ```Create Maven Project``` 

atau agar lebih mudah buka terminal arahkan ke direktory yang akan di buat project ketikan
```
mvn archetype:generate -DarchetypeArtifactId=jersey-quickstart-grizzly2 \
-DarchetypeGroupId=org.glassfish.jersey.archetypes -DinteractiveMode=false \
-DgroupId=com.example -DartifactId=simple-service -Dpackage=com.example \
-DarchetypeVersion=2.30
```
untuk membuat maven project secara instan.

jika gagal install dulu maven di laptop anda dengan 
```
sudo apt update
sudo apt install maven
```
Sehingga menghasilkan projek pada folder ```simpel-service```
