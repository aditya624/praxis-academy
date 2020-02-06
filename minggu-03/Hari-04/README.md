# 1. Instalasi Node.js
1. Download node.js dari web https://nodejs.org/en/download/
2. Unzip 
```
 sudo mkdir -p /usr/local/lib/nodejs
 sudo tar -xJvf node-v12.14.1-linux-x64.tar.xz -C /usr/local/lib/nodejs 
```
3. Set environment di ~/.profile dan ~/.bashrc
```
export PATH=/usr/local/lib/nodejs/node-v12.14.1-linux-x64.tar.xz/bin:$PATH
```
4. Lakukan refresh 
```
. ~/.profile
```
5. Test Instalasi 
```
pika@pika-PC:~/Downloads$ node -v
v12.14.1

pika@pika-PC:~/Downloads$ npm version
{
  npm: '6.13.4',
  ares: '1.15.0',
  brotli: '1.0.7',
  cldr: '35.1',
  http_parser: '2.8.0',
  icu: '64.2',
  llhttp: '2.0.1',
  modules: '72',
  napi: '5',
  nghttp2: '1.40.0',
  node: '12.14.1',
  openssl: '1.1.1d',
  tz: '2019c',
  unicode: '12.1',
  uv: '1.33.1',
  v8: '7.7.299.13-node.16',
  zlib: '1.2.11'
}

pika@pika-PC:~/Downloads$ npx -v
6.13.4

```

