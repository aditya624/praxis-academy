# 1. Create New Organizations
[Membuat Organisasi](https://github.com/settings/organizations) pada gitHub adalah suatu cara untuk berkolaborasi dengan user lain perihal suatu projek. berikut gambar awal tanpa organisasi dan penulis ingin membuatnya.
## a. Tampilan Awal
Berikut adalah tampilan awal untuk orgranisasi yang kosong. Kita dapat klik **new organization**

![1](https://lh3.googleusercontent.com/Xz9IMnG24adBjbI08mKuodPfBSgPB4GwBnQZbfNIi66lklf4ZMjMqizFTZPPKNTDIFUC-TyhVPv701fcApfj1zCe0hbvxX3Y2tuihbrx-pvHOYyF7Q-tTm5_xe4HS-Fxq143c-Me5w=w1104-h447-no)

## b. Set Up My Team
Pada Gambar dibawah saya membuat nama akun organisasi dan lain-lain. Kemudian Klik Next.

![2](https://lh3.googleusercontent.com/udD27M7S0k8Gq8LS86R-SvfIoQepThPFmJ515-H--8jbUEvhWcuozB1PyfK6-ivdekmYc889GynqYX3K6t7gPSZaR9mVani_c6dtqb-sQj41hcHoNdl00TCLWxNEEQ6pkNILQbrHQw=w753-h613-no)

## c. Memilih member team 
Kita dapat memilih anggota team by username. kemudian complete setup. Kita menunggu user lain untuk mengkonfirmasi masuk dalam team.
![3](https://lh3.googleusercontent.com/V9wog59VpVx-RbBB9CvsBx5r0PlyDxJitTDhFleyCozJA1bI-5VUwac9NNtSFjoFxmGy_2ekCYDk-bLj_mKoBqmSGd5-M7YRwKoPszmcn_z2OcrfXqooVECXz95mv6cIgGUNBPT1Wg=w832-h582-no) 

## d. Sukses
Organisasi berhasil dibuat dan belum memiliki repo.
![4](https://lh3.googleusercontent.com/mv5JhGTE7ev8sNlmRFnALyVViEzKSN7nyumXN7IhbLsCU15JgaXoQlcDrGevBSAHEnhYV6jaL_KM9Z_lvJ-092S2Gl_ARzjm5U3BMwb4darNg-MjPN5kBlpAPGenBJC0aK2B3TKjAQ=w1115-h511-no)

# 2. Repository 
Setelah ini akan di jelaskan bagaimana mekanisme repo di organisasi.

## a. Create a new repository
Pada tampilan sebelumnya kita pilih create a new repository dengan nama praktik-2-repo. hampir sama membuat repo pada user.

## b. Complete 
Berikut adalah tampilan awal pada repository di organisasi.

![5](https://lh3.googleusercontent.com/iUwaVeyoi0FMZJBur6iGYm37Errk5upEnz-FJP1jCPhVZOqBsFqh353ELCd89aP3C6BRxuO0SN9vZaxpKUBXe1u2AdFqzWWjiI6RnWarh6Lfk5LmX1s4TcAvJ-SPYlle1P5MBRxH7A=w1056-h444-no)

## c. Add teams and collaborators 
Anda dapat menambahkan team dan kolaborasi dengan user lain yaitu klik "Add teams and collaborators" kemudian silahkan tambahkan user di team atau di collaborators.

Anda juga bisa klik setting di pojok repo untuk menambahkan lagi nantinya.

![6](https://lh3.googleusercontent.com/rkt650Qcvdsk4nSp7eXx2tJ73wSOQDnY0NwAcbQgtEy--4dTevrYAv_Dec29BAxXU8kaiJXCMlTel4HB7ov3G6C6DT34ATg-S15R_JxVp10R-YODA5PvKzirFvhO-Jic1cSA-NY60w=w752-h428-no)

## d. Push First Commit
Buat folder dengan nama organisasi. Kemudian, isikan kode di terminal ubuntu,

        pika@pika-PC:~$ cd organisasi
        pika@pika-PC:~/organisasi$ git init
        Initialized empty Git repository in /home/pika/organisasi/.git/
        pika@pika-PC:~/organisasi$ echo "# praktik-2-repo" >> README.md
        pika@pika-PC:~/organisasi$ git add .
        pika@pika-PC:~/organisasi$ git commit -m 'first commit'
        [master (root-commit) b1b15c7] first commit
        1 file changed, 1 insertion(+)
        create mode 100644 README.md
        pika@pika-PC:~/organisasi$ git push origin master
        Username for 'https://github.com': aditya624
        Password for 'https://aditya624@github.com': 
        Counting objects: 3, done.
        Writing objects: 100% (3/3), 225 bytes | 225.00 KiB/s, done.
        Total 3 (delta 0), reused 0 (delta 0)
        To https://github.com/praktik-2/praktik-2-repo.git
        * [new branch]      master -> master

First commit berhasil dipush ke repo organisasi

![7](https://lh3.googleusercontent.com/cip3MKTc0jCghRez4GeLO69ZBwlmb61O3OB7KuTBiQY9agCulZ8fsJFZakmHGQ3z5CWhKW9NK3okRfacsVsQacJ3qa0pNv8z7rh2XREv_igPqNe2hx8WKgsTTs5jY3Mgx8j1s0siDw=w1018-h556-no)

# 3. Pull Requests
Terdapat 2 model pull request yaitu **Fork & Pull Model** dan **Share Repository Model**

Sekarang mari kita klik fork di pojok kanan atas 
![8](https://lh3.googleusercontent.com/qwQ8oIuozMJBBgdRnERZdlPzTft8ituOwOP7l7Ol6lqSlfHrqkIHV2G74iiseNRIXIkfl5wHPFu_SjGHJ9qFnfmbAFNmVm1Uq5gAgWLS3slCZONo9_B0EEXSNaKqPHpCPahzZoinXg=w1041-h560-no)

dan pilih user milik kita.
![https://lh3.googleusercontent.com/EzkT3ltbGL5ttHMY6kJcejFtAsKTTFyOZmOXIe5ZhZgEboFWLSUgAfQR_-lRCHmUO0EPa9469NV4yp9KU4qWxH0CLutkiGmu0XeGwaZNCi_qRqVYBKQBut1UR0v6vkoe9pck7gqkKQ=w444-h194-no](https://lh3.googleusercontent.com/EzkT3ltbGL5ttHMY6kJcejFtAsKTTFyOZmOXIe5ZhZgEboFWLSUgAfQR_-lRCHmUO0EPa9469NV4yp9KU4qWxH0CLutkiGmu0XeGwaZNCi_qRqVYBKQBut1UR0v6vkoe9pck7gqkKQ=w444-h194-no)

sehingga repo tersebut akan terkirim ke profil kita seperini,

![https://lh3.googleusercontent.com/Pj1gwUm4vFR851riKI4cT005deZAFDku2ZW3TOwrQWjGRrlCwF-nzvvEpFNELTjlyLy1wqobX-ZjrGB-zbcnZoWuIqs58GL-e2Hn-kzW1ArmgJgMnwYwDEOtG881jIn2w5CXwhOpfw=w968-h310-no](https://lh3.googleusercontent.com/Pj1gwUm4vFR851riKI4cT005deZAFDku2ZW3TOwrQWjGRrlCwF-nzvvEpFNELTjlyLy1wqobX-ZjrGB-zbcnZoWuIqs58GL-e2Hn-kzW1ArmgJgMnwYwDEOtG881jIn2w5CXwhOpfw=w968-h310-no)

Selanjutnya clone praktik-2-repo

        pika@pika-PC:~$ git clone https://github.com/praktik-2/praktik-2-repo
        Cloning into 'praktik-2-repo'...
        remote: Enumerating objects: 3, done.
        remote: Counting objects: 100% (3/3), done.
        remote: Total 3 (delta 0), reused 3 (delta 0), pack-reused 0
        Unpacking objects: 100% (3/3), done.
        pika@pika-PC:~$ cd praktik-2-repo

dengan mudah membuat branch baru,

        pika@pika-PC:~/praktik-2-repo$ echo "try" >> README.md
        pika@pika-PC:~/praktik-2-repo$ git add .
        pika@pika-PC:~/praktik-2-repo$ git commit -m "informastion added in readme"
        [new-branch 0c89273] informastion added in readme
        1 file changed, 1 insertion(+)
        pika@pika-PC:~/praktik-2-repo$ git checkout -b new-branch
        Switched to a new branch 'new-branch'

Sehingga terdapat 2 branch seperti berikut 

        pika@pika-PC:~/praktik-2-repo$ git branch
        master
        * new-branch

remote yang ada,

        pika@pika-PC:~/praktik-2-repo$ git remote -v
        origin	https://github.com/praktik-2/praktik-2-repo (fetch)
        origin	https://github.com/praktik-2/praktik-2-repo (push)

jika sudah yakin dengan url, selanjutnya push ke branch

        pika@pika-PC:~/praktik-2-repo$ git push origin new-branch
        Username for 'https://github.com': aditya624
        Password for 'https://aditya624@github.com': 
        Counting objects: 6, done.
        Delta compression using up to 8 threads.
        Compressing objects: 100% (2/2), done.
        Writing objects: 100% (6/6), 512 bytes | 512.00 KiB/s, done.
        Total 6 (delta 0), reused 0 (delta 0)
        remote: 
        remote: Create a pull request for 'new-branch' on GitHub by visiting:
        remote:      https://github.com/aditya624/praktik-2-repo/pull/new/new-branch
        remote: 
        To https://github.com/aditya624/praktik-2-repo
        * [new branch]      new-branch -> new-branch
        pika@pika-PC:~/praktik-2-repo$ 
Selanjutnya pilih branch yang baru, kemudian pilih new pull 

![https://lh3.googleusercontent.com/TwUQaL_rQuz5crLx5UT5nmdqS83XsHUKcKI9heNhx3yrfTVUPMpmHObb6Ccj6HtrYyXra-SxgAhQoDjfcWoO3vOGaJ6CyLCsTugZT25VxpoBdX011HfPcWcosBizUFqYyYJ7XxdNkw=w1003-h526-no](https://lh3.googleusercontent.com/TwUQaL_rQuz5crLx5UT5nmdqS83XsHUKcKI9heNhx3yrfTVUPMpmHObb6Ccj6HtrYyXra-SxgAhQoDjfcWoO3vOGaJ6CyLCsTugZT25VxpoBdX011HfPcWcosBizUFqYyYJ7XxdNkw=w1003-h526-no)

Sehingga muncul pull request 

![https://lh3.googleusercontent.com/YZHqtmJMs4w0xqL4fVkjTp7VmxZtZM1zAqazbFetCOY08gV5UZLo3hnfKDAyCi2Anzmicl7zgSP5G2_ade-ev1IXnHugg2NJUCJeHd6UFIyWMK9RSqz7jOllIZ0_end4i8wIhgjAZw=w988-h604-no](https://lh3.googleusercontent.com/YZHqtmJMs4w0xqL4fVkjTp7VmxZtZM1zAqazbFetCOY08gV5UZLo3hnfKDAyCi2Anzmicl7zgSP5G2_ade-ev1IXnHugg2NJUCJeHd6UFIyWMK9RSqz7jOllIZ0_end4i8wIhgjAZw=w988-h604-no)

![https://lh3.googleusercontent.com/I9L9B61n5KsOuUYWzIHJoZi99Y1rVbrO8l8MKBb3UfQVN1VYxv3kypHUBpPDfa3s3lkzsDxzTud7ay00xFiOYHeglJ4SEOdL_L_OIpSIybM0PX9xc4itrfnpKrBletoZjX0Nkn1ffA=w1010-h588-no](https://lh3.googleusercontent.com/I9L9B61n5KsOuUYWzIHJoZi99Y1rVbrO8l8MKBb3UfQVN1VYxv3kypHUBpPDfa3s3lkzsDxzTud7ay00xFiOYHeglJ4SEOdL_L_OIpSIybM0PX9xc4itrfnpKrBletoZjX0Nkn1ffA=w1010-h588-no)