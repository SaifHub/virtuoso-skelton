FROM maven:3.3.9-jdk-8

# Install unzip, Xvfb
RUN wget -q -O - https://dl-ssl.google.com/linux/linux_signing_key.pub | apt-key add - \
  && sh -c 'echo "deb [arch=amd64] http://dl.google.com/linux/chrome/deb/ stable main" >> /etc/apt/sources.list.d/google-chrome.list' \
  && apt-get update && apt-get install -y --no-install-recommends google-chrome-stable unzip xvfb \
  && rm -rf /var/lib/apt/lists/* \
  && rm /etc/apt/sources.list.d/google-chrome.list

# Install Chromedriver
RUN wget https://chromedriver.storage.googleapis.com/2.25/chromedriver_linux64.zip \
  && unzip chromedriver_linux64.zip -d /usr/local/bin && rm chromedriver_linux64.zip \
  && chmod +x /usr/local/bin/chromedriver

#RUN mkdir /test
#COPY uk.gov.skeleton-src.zip /test

#RUN cd test \
#  && unzip uk.gov.skeleton-src.zip \
#  && mvn clean test -DskipTests

ENV DISPLAY :99

VOLUME /root/.m2

ADD xvfb /etc/init.d
RUN chmod +x /etc/init.d/xvfb
RUN update-rc.d xvfb defaults

CMD (service xvfb start;  mvn clean test);
