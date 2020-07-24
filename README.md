<h1 align="center">
  <br>
  <a href=""><img src="https://user-images.githubusercontent.com/22215824/88429873-ac11d280-ce0c-11ea-9de7-010353e6d32d.png" alt="Toaster" width="100"></a>
  <br>
  Toaster
  <br>
</h1>

<h4 align="center">You can generate a toast message easily and fast by <a href="https://github.com/mhadikz/Toaster/" target="_blank">Toaster</a>.</h4>

## Toaster statuses

Toaster has four styles for different statuses that include information, success, warning, and error.

<p align="center">
  <a href="https://github.com/mhadikz/Toaster">
    <img src="https://user-images.githubusercontent.com/22215824/88429645-3dcd1000-ce0c-11ea-9a72-0a8561887e7e.png" alt="Toaster-Information">
  </a>
  
  <a href="https://github.com/mhadikz/Toaster">
    <img src="https://user-images.githubusercontent.com/22215824/88429672-46bde180-ce0c-11ea-83a5-db3329694372.png" alt="Toaster-Success">
  </a>
  
  <a href="https://github.com/mhadikz/Toaster">
    <img src="https://user-images.githubusercontent.com/22215824/88429690-4f161c80-ce0c-11ea-8ce7-64d46d6a7f6c.png" alt="Toaster-Warning">
  </a>
  
  <a href="https://github.com/mhadikz/Toaster">
    <img src="https://user-images.githubusercontent.com/22215824/88429709-563d2a80-ce0c-11ea-981b-037fe49a45f2.png" alt="Toaster-Error">
  </a>

</p>


## Dependency

Add this line to your `build.gradle` file:

```gradle
dependencies {
	    implementation 'com.github.mhadikz:toaster:1.0.0'
}
```
## How To Use

Toaster needs some parameters for generating your toast and call `show()`. You have to create a builder for showing Toaster message:

```java
new Toaster.Builder(<Context>)
                    .setTitle(<Title text>)
                    .setDescription(<Description text>)
                    .setDuration(<Duration time by selecting from Toaster>)
                    .setStatus(<Toast status by selecting from Toaster.Status>)
                    .show();
```

## Example
```java
new Toaster.Builder(this)
                    .setTitle(getString(R.string.info_title))
                    .setDescription(getString(R.string.info_description))
                    .setDuration(Toaster.LENGTH_SHORT)
                    .setStatus(Toaster.Status.INFO)
                    .show();
```

## License

    Copyright 2020 Mohammad Hadi Karamzadeh

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
