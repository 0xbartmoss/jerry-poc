# Jerry PoC


*This repository contains a Proof of Concept (PoC) for educational and research purposes only. The code is part of a cybersecurity learning exercise conducted within Hack The Box (HTB) labs and other ethical hacking environments.*

*I do not endorse, support, or encourage any illegal activities. The purpose of this PoC is to help cybersecurity students and professionals understand malware behavior, detection, and mitigation techniques in a controlled environment.*

*Use this code responsibly. Deploying or modifying this code outside of authorized lab environments may violate laws and terms of service.
I am not responsible for any misuse, damage, or legal consequences resulting from this code.*

***

This is a simple PoC for a Jerry Machine on HackTheBox.

This PoC contains java code that is needed to execute the Havoc C2 agent inside of the WAR package that's been deployed on Apache Tomcat via Application Manager page.

All you need to is:

1. place Havoc agent under /resources folder
2. execute `mvn package` to generate package
3. uploat generated WAR to the Application Manager
4. gain access
