! Important Note !:

This FlyAway build uses JAX web services which includes java classes refered to using "javax" which has been renamed to "jakarta" on Tomcat V10.
As such the imports of any "javax" librairies are hard coded to "jakarta" and will have to be changed back to "javax" to use on older versions of Tomcat.

The FlyAway project is built on JavaSE-16. This was because it was started on SE but should still be EE compatible.

JRE: Java Standard Edition Version 16
Server Runtime: Apache Tomcat Version 10
Database: MySQL Version 8.0.25
