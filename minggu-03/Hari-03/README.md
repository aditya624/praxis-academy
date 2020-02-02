# Micronaut
## Cara Install 
Install SDK terlebih dahulu
```
$ curl -s https://get.sdkman.io | bash
$ source "$HOME/.sdkman/bin/sdkman-init.sh"
```
kemudian install micronaout 
```
$ sdk install micronaut
```
Cek: 
```
$ mn --version
```
## Membuat Projek
Gunakan code dibawah dengan nama projek complete
```
mn create-app example.micronaut.complete
```
tambahkan di ```gradle.build```
```
annotationProcessor "io.micronaut:micronaut-graal"
```
## Melakukn Test
1. Buat code di main 
2. Buat code di test untuk proses testing
3. Ketikan ```$ ./gradlew test```
4. cek pada ```build/reports/tests/test/index.html``` untuk mengetahui prosentase keberhasilan testing
