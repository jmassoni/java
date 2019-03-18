{ Nested while statement }

program basic_nested_while:

    count := 0
    sum := 0

    while count < 5:
        i := 0

        while i < 5:
            sum := sum + 1
            i := i + 1
        end

        count := count + 1
    end

    print sum
end