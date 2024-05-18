package org.example

//1
open class Clich{}
class Clack:Clich(){}


//2
open class Top{}
class Tip:Clich(){}


//3
open class Alpha{}
class Omega:Clich(){}


//4
open class Foo{}
open class Bar : Foo(){}
class Baz : Bar(){}


//5
interface Fi{}
open class Fee:Fi{}
class Fo : Fee(){}
class Fum : Fo(){}

