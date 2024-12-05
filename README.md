# boot-env

## 환경 변수 설정 하는 방법 

### power shell 
#### 값 설정 : [System.Environment]::SetEnvironmentVariable('환경변수명', '값')
#### 값 확인 : [System.Environment]::GetEnvironmentVariable('환경변수명')
#### [System.Environment]::SetEnvironmentVariable('ENV_URL', 'url')
#### [System.Environment]::SetEnvironmentVariable('ENV_USERNAME', 'hong')
#### [System.Environment]::SetEnvironmentVariable('ENV_PASSWORD', '1234')
#### 스프링 부트 프로젝트 power shell에서 실행 
#### ./gradlew bootRun



### cmd 
#### 값 설정 : set 환경변수명=값
#### 값 설정 예: set ENV_URL=http://localhost
#### 값 확인 : echo %환경변수명%
#### 값 확인 예: echo %ENV_URL%
#### set ENV_URL=url
#### set ENV_USERNAME=hong
#### set ENV_PASSWORD=1234
#### 스프링 부트 프로젝트 cmd에서 실행 
#### ./gradlew bootRun

### bash shell
#### 값 설정 : export 환경변수명=값
#### 값 설정 예: export ENV_URL=http://localhost
#### 값 확인 : echo $환경변수명
#### 값 확인 예: echo $ENV_URL
#### export ENV_URL=url
#### export ENV_USERNAME=hong
#### export ENV_PASSWORD=1234
#### 스프링 부트 프로젝트 bash shell에서 실행 
#### ./gradlew bootRun


### 외부 파일로 환경설정 변수 설정 
#### 1 .env 파일을 생성하고 파일에 환경변수=값을 설정한다
#### 2 application.properties 파일에 .env 파일에 대한 설정정보를 등록한다(spring.config.import=optional:file:.env[.properties])


### 윈도에서 생성한 프로젝트를 mac 또는 리눅스에서 gradlew를 실행할 때 줄바끔으로 인한 오류 해결 
#### dos2unix 프로그램으로 텍스트 파일을 unix 서식 파일로 변경함 
#### dos2unix ./gradlew


### jar 파일 생성 
#### ./gradlew build
#### 위와 같이 하면 .env 파일은 jar 파일에 포함되지 않는다.  
#### 

### Dockerfile 작성
#### Dockerfile 참조
#### docker image에 .env 파일은 기본적으로 포함되지 않아 직접 복사해야 한다

