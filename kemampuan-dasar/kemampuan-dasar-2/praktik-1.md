pika@pika-PC:~$ mkdir rhymes
pika@pika-PC:~$ cd rhymes
pika@pika-PC:~/rhymes$ git init
Initialized empty Git repository in /home/pika/rhymes/.git/
pika@pika-PC:~/rhymes$ touch README.txt
pika@pika-PC:~/rhymes$ git add README.txt
pika@pika-PC:~/rhymes$ git commit -m 'First commit.'
[master (root-commit) a6005ed] First commit.
 1 file changed, 0 insertions(+), 0 deletions(-)
 create mode 100644 README.txt
pika@pika-PC:~/rhymes$ echo 'This repo is a collection of my favorite nursery rhymes.' >> README.txt
pika@pika-PC:~/rhymes$ git status
On branch master
Changes not staged for commit:
  (use "git add <file>..." to update what will be committed)
  (use "git checkout -- <file>..." to discard changes in working directory)

	modified:   README.txt

no changes added to commit (use "git add" and/or "git commit -a")
pika@pika-PC:~/rhymes$ git diff
diff --git a/README.txt b/README.txt
index e69de29..c83e022 100644
--- a/README.txt
+++ b/README.txt
@@ -0,0 +1 @@
+This repo is a collection of my favorite nursery rhymes.
pika@pika-PC:~/rhymes$ git add README.txt
pika@pika-PC:~/rhymes$ git commit -m 'Added project overview to README.txt'
[master c8b8c4c] Added project overview to README.txt
 1 file changed, 1 insertion(+)

### dibagian ini file tidak bisa didownload karena not found 404. sehingga saya membuat manual didalam folder.
# Alice downloads favorite rhymes.
wget https://www.acquia.com/sites/default/files/blog/all-around-the-mulberry-bush.txt
wget https://www.acquia.com/sites/default/files/blog/jack-and-jill.txt
wget https://www.acquia.com/sites/default/files/blog/old-mother-hubbard.txt
wget https://www.acquia.com/sites/default/files/blog/twinkle-twinkle.txt
wget https://www.acquia.com/sites/default/files/blog/hokey-pokey.txt 

pika@pika-PC:~/rhymes$ git add all-around-the-mulberry-bush.txt
pika@pika-PC:~/rhymes$ git status
On branch master
Changes to be committed:
  (use "git reset HEAD <file>..." to unstage)

	new file:   all-around-the-mulberry-bush.txt

Untracked files:
  (use "git add <file>..." to include in what will be committed)

	hokey-pokey.txt
	jack-and-jill.txt
	old-mother-hubbard.txt
	twinkle-twinkle.txt

pika@pika-PC:~/rhymes$ git commit -m 'Added all-around-the-mulberry-bush.txt.'
[master ad94410] Added all-around-the-mulberry-bush.txt.
 1 file changed, 19 insertions(+)
 create mode 100644 all-around-the-mulberry-bush.txt
pika@pika-PC:~/rhymes$ git add jack-and-jill.txt
pika@pika-PC:~/rhymes$ git commit -m 'Added jack-and-jill.txt.'
[master 156c9d2] Added jack-and-jill.txt.
 1 file changed, 12 insertions(+)
 create mode 100644 jack-and-jill.txt
pika@pika-PC:~/rhymes$ git add .
pika@pika-PC:~/rhymes$ git commit -m 'Added old-mother-hubbard.txt, twinkle-twinkle.txt, hokey-pokey.txt'
[master 49d5fa2] Added old-mother-hubbard.txt, twinkle-twinkle.txt, hokey-pokey.txt
 3 files changed, 56 insertions(+)
 create mode 100644 hokey-pokey.txt
 create mode 100644 old-mother-hubbard.txt
 create mode 100644 twinkle-twinkle.txt
pika@pika-PC:~/rhymes$ git log
commit 49d5fa250fbda8fecbd23e602e128db6aa7341f8 (HEAD -> master)
Author: aditya624 <adityaadit677@gmail.com>
Date:   Sun Dec 29 09:51:38 2019 +0700

    Added old-mother-hubbard.txt, twinkle-twinkle.txt, hokey-pokey.txt

commit 156c9d250184833d0a271b726fea43aa4f1161c5
Author: aditya624 <adityaadit677@gmail.com>
Date:   Sun Dec 29 09:51:25 2019 +0700

    Added jack-and-jill.txt.

commit ad9441077845feff15b02b82ca5f062b4759c2de
Author: aditya624 <adityaadit677@gmail.com>
Date:   Sun Dec 29 09:51:10 2019 +0700

    Added all-around-the-mulberry-bush.txt.

commit c8b8c4c1a17555801311ffcc6706babb51a5cb9a
Author: aditya624 <adityaadit677@gmail.com>
Date:   Sun Dec 29 09:48:31 2019 +0700

    Added project overview to README.txt
pika@pika-PC:~/rhymes$ git log --oneline
49d5fa2 (HEAD -> master) Added old-mother-hubbard.txt, twinkle-twinkle.txt, hokey-pokey.txt
156c9d2 Added jack-and-jill.txt.
ad94410 Added all-around-the-mulberry-bush.txt.
c8b8c4c Added project overview to README.txt
a6005ed First commit.
pika@pika-PC:~/rhymes$ git log -p
commit 49d5fa250fbda8fecbd23e602e128db6aa7341f8 (HEAD -> master)
Author: aditya624 <adityaadit677@gmail.com>
Date:   Sun Dec 29 09:51:38 2019 +0700

    Added old-mother-hubbard.txt, twinkle-twinkle.txt, hokey-pokey.txt

diff --git a/hokey-pokey.txt b/hokey-pokey.txt
new file mode 100644
index 0000000..97f425b
--- /dev/null
+++ b/hokey-pokey.txt
@@ -0,0 +1,16 @@
+You put your right foot in,
+You put your right foot out;
+You put your right foot in,
+And you shake it all about.
+You do the Hokey-Pokey,
+And you turn yourself around.
+That's what it's all about!
+
+You put your left foot in...
+You put your right hand in...
+You put your right side in...
pika@pika-PC:~/rhymes$ git remote add origin https://github.com/aditya624/rhymes.git
pika@pika-PC:~/rhymes$ git push -u origin master
Username for 'https://github.com': aditya624
Password for 'https://aditya624@github.com': 
Counting objects: 17, done.
Delta compression using up to 8 threads.
Compressing objects: 100% (14/14), done.
Writing objects: 100% (17/17), 2.22 KiB | 569.00 KiB/s, done.
Total 17 (delta 2), reused 0 (delta 0)
remote: Resolving deltas: 100% (2/2), done.
To https://github.com/aditya624/rhymes.git
 * [new branch]      master -> master
Branch 'master' set up to track remote branch 'master' from 'origin'.

# Bob mengkopi projek alice
pika@pika-PC:~$ cd bob
pika@pika-PC:~/bob$ git clone https://github.com/aditya624/rhymes.git
Cloning into 'rhymes'...
remote: Enumerating objects: 17, done.
remote: Counting objects: 100% (17/17), done.
remote: Compressing objects: 100% (12/12), done.
remote: Total 17 (delta 2), reused 17 (delta 2), pack-reused 0
Unpacking objects: 100% (17/17), done.
pika@pika-PC:~/bob$ cd rhymes
pika@pika-PC:~/bob/rhymes$ git checkout -b hickory-dickory
Switched to a new branch 'hickory-dickory'

# Add Hickory Dickory Dock to the repo. (Link tidak ada oleh karena itu saya input manual)
wget https://www.acquia.com/sites/default/files/blog/hickory-dickory-dock.txt...

pika@pika-PC:~/bob/rhymes$ git add hickory-dickory-dock.txt
pika@pika-PC:~/bob/rhymes$ git commit -m 'Added hickory-dickory-dock.txt.'
[hickory-dickory fcda8cf] Added hickory-dickory-dock.txt.
 1 file changed, 5 insertions(+)
 create mode 100644 hickory-dickory-dock.txt
pika@pika-PC:~/bob/rhymes$ git push origin hickory-dickory
Username for 'https://github.com': aditya624
Password for 'https://aditya624@github.com': 
Counting objects: 3, done.
Delta compression using up to 8 threads.
Compressing objects: 100% (3/3), done.
Writing objects: 100% (3/3), 353 bytes | 353.00 KiB/s, done.
Total 3 (delta 1), reused 0 (delta 0)
remote: Resolving deltas: 100% (1/1), completed with 1 local object.
remote: 
remote: Create a pull request for 'hickory-dickory' on GitHub by visiting:
remote:      https://github.com/aditya624/rhymes/pull/new/hickory-dickory
remote: 
To https://github.com/aditya624/rhymes.git
 * [new branch]      hickory-dickory -> hickory-dickory

# 3. Alice reviews and accepts Bob's simple changes
pika@pika-PC:~$ cd rhymes
pika@pika-PC:~/rhymes$ git remote rename origin alice
pika@pika-PC:~/rhymes$ git remote add bob https://github.com/aditya624/rhymes.git
pika@pika-PC:~/rhymes$ git remote
alice
bob
pika@pika-PC:~/rhymes$ git remote -v
alice	https://github.com/aditya624/rhymes.git (fetch)
alice	https://github.com/aditya624/rhymes.git (push)
bob	https://github.com/aditya624/rhymes.git (fetch)
bob	https://github.com/aditya624/rhymes.git (push)
pika@pika-PC:~/rhymes$ git fetch bob
remote: Enumerating objects: 4, done.
remote: Counting objects: 100% (4/4), done.
remote: Compressing objects: 100% (2/2), done.
remote: Total 3 (delta 1), reused 3 (delta 1), pack-reused 0
Unpacking objects: 100% (3/3), done.
From https://github.com/aditya624/rhymes
 * [new branch]      hickory-dickory -> bob/hickory-dickory
 * [new branch]      master          -> bob/master
pika@pika-PC:~/rhymes$ git branch -a
* master
  remotes/alice/master
  remotes/bob/hickory-dickory
  remotes/bob/master
pika@pika-PC:~/rhymes$ git checkout -b hickory-dickory bob/hickory-dickory
Branch 'hickory-dickory' set up to track remote branch 'hickory-dickory' from 'bob'.
Switched to a new branch 'hickory-dickory'
pika@pika-PC:~/rhymes$ git diff master hickory-dickory
diff --git a/hickory-dickory-dock.txt b/hickory-dickory-dock.txt
new file mode 100644
index 0000000..a337f4c
--- /dev/null
+++ b/hickory-dickory-dock.txt
@@ -0,0 +1,5 @@
+Hickory, dickory, dock,
+The mouse ran up the clock.
+The clock struck one,
+The mouse ran down!
+Hickory, dickory, dock.
pika@pika-PC:~/rhymes$ git log -1 -p
commit fcda8cf6bac374b57a2cc5ed92cbca044c953caf (HEAD -> hickory-dickory, bob/hickory-dickory)
Author: aditya624 <adityaadit677@gmail.com>
Date:   Sun Dec 29 10:03:47 2019 +0700

    Added hickory-dickory-dock.txt.

diff --git a/hickory-dickory-dock.txt b/hickory-dickory-dock.txt
new file mode 100644
index 0000000..a337f4c
--- /dev/null
+++ b/hickory-dickory-dock.txt
@@ -0,0 +1,5 @@
+Hickory, dickory, dock,
+The mouse ran up the clock.
+The clock struck one,
+The mouse ran down!
+Hickory, dickory, dock.
pika@pika-PC:~/rhymes$ git checkout master
Switched to branch 'master'
Your branch is up to date with 'alice/master'.
pika@pika-PC:~/rhymes$ git merge hickory-dickory
Updating 49d5fa2..fcda8cf
Fast-forward
 hickory-dickory-dock.txt | 5 +++++
 1 file changed, 5 insertions(+)
 create mode 100644 hickory-dickory-dock.txt
pika@pika-PC:~/rhymes$ git branch -D hickory-dickory
Deleted branch hickory-dickory (was fcda8cf).

# Bob membuat banyak perubahan
pika@pika-PC:~$ cd bob/rhymes
pika@pika-PC:~/bob/rhymes$ git remote rename origin bob 
pika@pika-PC:~/bob/rhymes$ git remote add alice https://github.com/aditya624/rhymes.git
pika@pika-PC:~/bob/rhymes$ git remote 
alice
bob
pika@pika-PC:~/bob/rhymes$ git remote -v
alice	https://github.com/aditya624/rhymes.git (fetch)
alice	https://github.com/aditya624/rhymes.git (push)
bob	https://github.com/aditya624/rhymes.git (fetch)
bob	https://github.com/aditya624/rhymes.git (push)
pika@pika-PC:~/bob/rhymes$ git remote update
Fetching bob
Fetching alice
From https://github.com/aditya624/rhymes
 * [new branch]      hickory-dickory -> alice/hickory-dickory
 * [new branch]      master          -> alice/master
pika@pika-PC:~/bob/rhymes$ git checkout master
Switched to branch 'master'
Your branch is up to date with 'bob/master'.
pika@pika-PC:~/bob/rhymes$ git merge alice/master
Already up to date.
pika@pika-PC:~/bob/rhymes$ git diff alice/master 
pika@pika-PC:~/bob/rhymes$ git push bob master
Username for 'https://github.com': aditya624
Password for 'https://aditya624@github.com': 
Everything up-to-date
pika@pika-PC:~/bob/rhymes$ git checkout -b bobs-changes
Switched to a new branch 'bobs-changes'

### Saya tambahkan manual untuk wget 
wget https://www.acquia.com/sites/default/files/blog/jack-be-nimble.txt

pika@pika-PC:~/bob/rhymes$ git add jack-be-nimble.txt
pika@pika-PC:~/bob/rhymes$ git commit -m 'Added jack-be-nimble.txt.'
[bobs-changes 20d63b6] Added jack-be-nimble.txt.
 1 file changed, 0 insertions(+), 0 deletions(-)
 create mode 100644 jack-be-nimble.txt

### Manual wget 
wget https://www.acquia.com/sites/default/files/blog/mother-goose.txt

pika@pika-PC:~/bob/rhymes$ git add mother-goose.txt
pika@pika-PC:~/bob/rhymes$ git commit -m 'Added mother-goose.txt.'
[bobs-changes d58d7cc] Added mother-goose.txt.
 1 file changed, 0 insertions(+), 0 deletions(-)
 create mode 100644 mother-goose.txt
pika@pika-PC:~/bob/rhymes$ git commit -am 'Updated README.txt.'
[bobs-changes 60a06b1] Updated README.txt.
 1 file changed, 2 insertions(+), 1 deletion(-)
pika@pika-PC:~/bob/rhymes$ git diff --word-diff 

# Saya buat file manual 
untuk wget https://www.acquia.com/sites/default/files/blog/old-king-cole.txt
pika@pika-PC:~/bob/rhymes$ git commit -am 'Fixed typo in README.txt.'
[bobs-changes cb8fa39] Fixed typo in README.txt.
 1 file changed, 1 insertion(+), 1 deletion(-)
pika@pika-PC:~/bob/rhymes$ git commit -am 'Updated README.txt.'
[bobs-changes 236e4c9] Updated README.txt.
 1 file changed, 1 insertion(+), 2 deletions(-)
pika@pika-PC:~/bob/rhymes$ git commit -am 'Updated README.txt.'
[bobs-changes 877e835] Updated README.txt.
 1 file changed, 1 insertion(+), 1 deletion(-)
pika@pika-PC:~/bob/rhymes$ git add old-king-cole.txt
pika@pika-PC:~/bob/rhymes$ git add twinkle-twinkle.txt
pika@pika-PC:~/bob/rhymes$ git commit -m 'Added twinkle-twinkle.txt.'
[bobs-changes a1fd48c] Added twinkle-twinkle.txt.
 1 file changed, 0 insertions(+), 0 deletions(-)
 create mode 100644 old-king-cole.txt
pika@pika-PC:~/bob/rhymes$ git commit -am 'Updated README.txt.'
[bobs-changes 983eb76] Updated README.txt.
 1 file changed, 3 insertions(+), 1 deletion(-)
pika@pika-PC:~/bob/rhymes$ git log --oneline
6254656 (HEAD -> bobs-changes) Added hickory-dickory-dock.txt.
983eb76 Updated README.txt.
a1fd48c Added twinkle-twinkle.txt.
877e835 Updated README.txt.
236e4c9 Updated README.txt.
cb8fa39 Fixed typo in README.txt.
60a06b1 Updated README.txt.
d58d7cc Added mother-goose.txt.
20d63b6 Added jack-be-nimble.txt.
49d5fa2 (bob/master, bob/HEAD, alice/master, master) Added old-mother-hubbard.txt, twinkle-twinkle.txt, hokey-pokey.txt
156c9d2 Added jack-and-jill.txt.
ad94410 Added all-around-the-mulberry-bush.txt.
c8b8c4c Added project overview to README.txt
a6005ed First commit.
pika@pika-PC:~/bob/rhymes$ git rebase -i 49d5fa2
[detached HEAD 27975a2] Updated README.txt.
 Date: Sun Dec 29 10:25:51 2019 +0700
 1 file changed, 1 insertion(+), 1 deletion(-)
[detached HEAD 68c2042] Added twinkle-twinkle.txt.
 Date: Sun Dec 29 10:53:30 2019 +0700
 2 files changed, 3 insertions(+), 1 deletion(-)
 create mode 100644 old-king-cole.txt
Successfully rebased and updated refs/heads/bobs-changes.
pika@pika-PC:~/bob/rhymes$ git log --oneline
e6b1d7a (HEAD -> bobs-changes) Added hickory-dickory-dock.txt.
68c2042 Added twinkle-twinkle.txt.
27975a2 Updated README.txt.
d58d7cc Added mother-goose.txt.
20d63b6 Added jack-be-nimble.txt.
49d5fa2 (bob/master, bob/HEAD, alice/master, master) Added old-mother-hubbard.txt, twinkle-twinkle.txt, hokey-pokey.txt
156c9d2 Added jack-and-jill.txt.
ad94410 Added all-around-the-mulberry-bush.txt.
c8b8c4c Added project overview to README.txt
a6005ed First commit.


