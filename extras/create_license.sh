#!/bin/sh

sdk_root=$1

if [ ${#sdk_root} -eq 0 ]; then
    echo Missing path argument - SDK ROOT
    exit 0
fi

if ! [ -d "$sdk_root" ]; then
  echo $sdk_root does not exist.. creating
  mkdir "$sdk_root";
fi

license_dir=$sdk_root/licenses
if ! [ -d "$license_dir" ]; then
  echo $license_dir does not exist.. creating
  mkdir "$license_dir";
fi

license_path="$sdk_root/licenses/android-sdk-license"
echo 24333f8a63b6825ea9c5514f83c2829b004d1fee>>$license_path
echo Written license to $license_path
