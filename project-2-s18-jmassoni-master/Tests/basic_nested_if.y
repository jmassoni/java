{ The parser should handle nested if statements with no issue }

program basic_nested_if:

    a := 1
    b := 2

    if a <> b:
        if a < b:
            a := b
        end
    end

    print a

end