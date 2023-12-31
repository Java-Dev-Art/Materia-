**Create the package task and define the class Material inside it to represent uniform material.**

>Class fields:

* name,
* density
>Constructors:

* no-arg constructor;
* parameterized constructor.
>Methods:

* getters;
* toString – returns a string representation of uniform material in the csv–format: each field, separated by the ';' symbol.
**Example**
`steel;7850.0`
**Define the class Subject in the same package which represents a subject consisting of a uniform material.**

>Class fields:
* name,
* material,
* volume.
>Constructors:

* no-arg constructor;
* parameterized constructor.
>Methods:

* getters/setters;
* getMass – returns the subject mass (= density * volume);
* toString – returns a string representation of a subject in the csv–format: each field and the mass, separated by the ";" symbol.
**Example:**
  `wire;steel;7850.0;0.03;235.5`
>**Define the Runner class in the default package, where:**
1. Create the object which represents a steel wire having the volume 0.03 cubic metres.
2. Output the object content to the console, using toString method.
3. Update the wire material by the copper (density = 8500.0) and output its mass.
**Example:**
   `The wire mass is 255.0 kg.`