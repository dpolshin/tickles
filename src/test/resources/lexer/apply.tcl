#!/usr/bin/env tclsh

proc map {lambda list} {
   set result {}
   foreach item $list {
      lappend result [apply $lambda $item]
   }
   return $result
 }

 puts [map {x {return [string length $x] : $x}} {a bb ccc dddd}]