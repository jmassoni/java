{ Arithmetic on real numbers }

{ Modify the code for AddExpr, MultExpr, etc. to return a Double object if one
  of the inputs to its operation is a Double }

{ Arithmetic on integers should still return an integer result }

program optional_real_2:

    pi := 3.1415926
    r := 2

    area := r * r * pi

    print area

    print r * r  { prints integer value 4 }
end