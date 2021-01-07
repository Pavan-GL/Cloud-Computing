
Ensuring data storage using cloud computing and student information in database:

Description: 

> Cloud is a place where you can access apps and services and where your data can be stored securely. It doesn’t need any effort on your part to maintain or manage it.
> Amazon Simple Storage Service is storage for the Internet. It is designed to make web-scale computing easier for developers. Amazon S3 has a simple web services interface that you can use to store and retrieve any amount of data, at any time, from anywhere on the web.
> The algorithm described by AES is a symmetric-key algorithm, meaning the same key is used for both encrypting and decrypting the data.
> The key size used for an AES cipher specifies the number of repetitions of transformation rounds that convert the input, called the plaintext, into the final output, called the cipher text.
> The features of AES are as follows ?
		Symmetric key symmetric block cipher
		128-bit data, 128/192/256-bit keys
		Stronger and faster than Triple-DES
		Provide full specification and design details

Modules:
1. University Module: Initially the admin of the university logged in with his credentials and he can view the colleges and he can upload the question papers by choosing  file from the system. These  files will be encrypted and divided into 5 parts. Each part of the file will be encrypted using key given by the admin. The Key contain 2 parts. Each part having 32 bit key. So the whole key is 64 bit key.
2. College Module: Colleges will logged in by using the credentials  given by the university. They can view the messages sent by the university and they can download the materials using the key which is provided by the university during file upload. They are possible to  add student and update their marks and they can send feedback to the admin.


