# Notes for PlantUML

## General

### Comments

simple quote - "'"

Several lines - /' comment '/

## Class diagrams

### Decaring element

''' plantuml
@startuml
title Declaring elements
abstract        abstract
abstract class  "abstract class"
annotation      annotation
circle          circle
()              circle_short_form
diamond         diamond
<>              diamond_short_form
class           class
entity          entity
enum            enum
interface       interface
@enduml
'''

### Relations between classes

Extension   <|--
Composition *--
Aggregation o--
Arrow <--

''' plantuml
@startuml relations1
title Relations between classes 1
Class01 <|-- Class02
Class03 *-- Class04
Class05 o-- Class06
Class07 .. Class08
Class09 -- Class10
@enduml

''' platnuml
@startuml relation2
title Relations between classes 2
Class11 <|.. Class12
Class13 --> Class14
Class15 ..> Class16
Class17 ..|> Class18
Class19 <--* Class20
@enduml
'''

''' plantuml
@startuml relation3
title Relations between classes 3
Class21 #-- Class22
Class23 x-- Class24
Class25 }-- Class26
Class27 +-- Class28
Class29 ^-- Class30
@enduml
'''

### Labels on relations

''' plantuml
@startuml labels1
title Labels on relations
Class01 "1" *-- "many" Class02 : contains
Class03 o-- Class04 : aggregation
Class05 --> "1" Class06
@enduml
'''

You can add an extra arrow pointing at one object showing which object acts on the other object, using < or > at the end of the label

'''plantuml
@startuml labels2
class Car

Driver - Car : drives >
Car *-- Wheel : have 4 >
Car -- Person : < owns
@enduml
'''

### Adding methods

To declare fields and methods, you can use the symbol : followed by the field’s or method’s name. The system checks for parenthesis to choose between methods and fields.

'''plantuml
@startuml  methods
title Methods 1
Object <|-- ArrayList

Object : equals()
ArrayList : Object[] elementData
ArrayList : size()

@enduml
'''

Syntax is highly flegible about type/name order.

'''plantuml
@startuml methods2
title Methods 2
class Dummy {
    String data
    void methds()
}

class Flight {
    flightNumber : Integer
    departureTime : Date
}
@enduml
'''

You can use {field} and {method} modifiers to override default behaviour of the parser about fields and methods.

'''plantuml
@startuml methods3
title Override default behaviour
class Dummy {
    {field} A field (despite parentheses)
    {method} Some method
}
@enduml
'''

### Defining visibility

"-   private"
"#   protected"
"~   package private"
"+   public"

'''plantuml
@startuml access modifiers
title Defining visibility
 class Dummy {
    -field1
    #field2
    ~method1()
    +method2()
 }
@enduml
'''

You can turn off this feature using the skinparam classAttributeIconSize 0 command

'''plantuml
skinparam classAttributeIconSize 0
title skipparam
class Dummy {
-field1
~method1()
+method2()
}

'''

### Abstract and Static

'''plantuml
@startuml Static
 class Dummy {
    {static} String id
    {abstract} void methods()
 }
@enduml
'''
