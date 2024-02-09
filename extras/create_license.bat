@ECHO OFF
SET path=%1

IF NOT DEFINED path (
  ECHO Missing path argument - SDK ROOT
  EXIT /b 0
)

@rem Reverse slashes in case user used /
set path=%path:/=\%

@rem Remove double quotes to allow modifications
SET path=%path:"=%

SET sdk_root=%path%
IF NOT EXIST "%sdk_root%" (
  ECHO SDK ROOT directory does not exist.. creating
  MKDIR "%sdk_root%"
)

SET license_dir=%sdk_root%\licenses
IF NOT EXIST "%license_dir%" (
  ECHO License directory does not exist.. creating
  MKDIR "%license_dir%"
)

SET license_path="%sdk_root%\licenses\android-sdk-license"
ECHO 24333f8a63b6825ea9c5514f83c2829b004d1fee>>%license_path%
ECHO Written license to %license_path%
@rem Here we can add additional writes

@ECHO ON
