# @author: ABDUL SAIF
# @date  : 30/11/2016

FROM maven:3.3.9-jdk-8

MAINTAINER Abdul Saif <Saif.Abdul@qa.com>

# UPDATES ubuntu package and UNZIP & INSTALL xvfb
RUN apt-get update && apt-get install -y -q unzip xvfb

# DOWNLOADS and UNZIPS the chromedriver required for the Google Chrome browser
RUN wget https://chromedriver.storage.googleapis.com/2.25/chromedriver_linux64.zip \
    && unzip chromedriver_linux64.zip -d /usr/local/bin && rm chromedriver_linux64.zip \
    && chmod +x /usr/local/bin/chromedriver

# DOWNLOADS authorisation key needed to INSTALL Google Chrome and UPDATE associated packages
RUN wget -q -O - https://dl-ssl.google.com/linux/linux_signing_key.pub | apt-key add - \
    && sh -c 'echo "deb [arch=amd64] http://dl.google.com/linux/chrome/deb/ stable main" >> /etc/apt/sources.list.d/google-chrome.list' \
    && apt-get update \
    && apt-get install google-chrome-stable -y -q

# DOWNLOADS package, Mozilla Firefox and INSTALLS iceweasel (aka Firefox)
RUN apt-get install software-properties-common -y \
    && add-apt-repository -y ppa:mozillateam/firefox-next \
    && apt-get install -y -q iceweasel

# ADDS test files
# ADD virtuoso-skelton /

# CONFIGURES xvfb
ENV DISPLAY :99

# USES local host files
VOLUME /root/.m2

# CREATE 'test' directory
RUN mkdir test

# MOUNT 'test' directory to local disk
VOLUME /test

# WHEN container starts; already within test directory (e.g. similar to cd ..)
WORKDIR /test

# ADDS xvfb file for display
ADD xvfb.sh /

# EXECUTES xvfb and begins build
CMD . /xvfb.sh && mvn clean test
