program basic_parse_error_1:

    a := 1
    b := 2

    if a > 0:

        if b > 0:
            a := 0
            b := 0
        end

    { Missing end }

end