# SoftwareSecurity
Software Security Portfolio Prep for SNHU CS-305

# Briefly summarize your client, Artemis Financial, and its software requirements. Who was the client? What issue did the company want you to address?
Artemis Finanicial is a consulting company that devlops individualized financial plants for its customers, and they required Global Rain to create and improve their security. For a financial company, they wanted to encrypt end to end traffic for their customers, as well as keeping their dependencies and data up to date.

# What did you do well when you found your client’s software security vulnerabilities? Why is it important to code securely? What value does software security add to a company’s overall well-being?
I believe that I did well at identifying vulnerabilities using the OWASP Dependency check as well as implementing the encryption SHA-256. It's important to keep the code secured and updated since many new breaches can be found and leaving them on older versions leaves the code to those vulnerabilities. By adding consistent dependency checks and end to end encryption, the security of the company skyrockets and becomes much more safe to store data and use Artemis Financial.

# Which part of the vulnerability assessment was challenging or helpful to you?
The most challenging part of the vulnerability assessment was interpreting the results of the dependency checks. Additionally, some of the vulnerabilities could be false positives so I had to learn how to suppress them, while some of the other vulernabilities required additional research to see exactly how much a threat they are.

# How did you increase layers of security? In the future, what would you use to assess vulnerabilities and decide which mitigation techniques to use?
I increased the layers of security by doing vulerabilty dependency checks, then adding encryption with SHA-256, and even more with an additional AES-256 on top of that. This is more than enough for end to end encryption and keeping all dependencies up to date and keeping Artemis Financial safe from outside attacks.

# How did you make certain the code and software application were functional and secure? After refactoring the code, how did you check to see whether you introduced new vulnerabilities?
I refactored the code in such a way using MessageDigest and java to keep the encryption truely random, while still being functional and secure. Afterwards, I used OWASP dependency check to see if there were any vulnerabilities that were introduced from my refactored code, and there was not any.

# What resources, tools, or coding practices did you use that might be helpful in future assignments or tasks?
I used OWASP dependency check, MAVEN, eclipse, used proper HTTPS configuration, and followed secure coding guidelines. I will 100% use these programs and practices in many future projects as well as any personal needs that I may have.

# Employers sometimes ask for examples of work that you have successfully completed to show your skills, knowledge, and experience. What might you show future employers from this assignment?
I would show the vulnerabillity assessment tool that I used, my security improvements for the application, and encryption and hashing. This project directly demonstrates my ability to use and utilize those tools, as well as my ability to analyze existing software and identify security risks.
