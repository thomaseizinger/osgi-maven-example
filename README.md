# Technologies

The project uses the following technologies:

- Apache Felix
- OSGi declarative services
- Maven

# Project configuration

Each module contains a .bnd file that describes the OSGi bundle that should be generated out of the module.
The parent project defines the necessary maven plugins to automate the build process:
- Maven Jar Plugin
- Bnd Maven Plugin (by biz.aQute.bnd) **not the Apache Felix BND Plugin**
- Maven Scr Plugin


