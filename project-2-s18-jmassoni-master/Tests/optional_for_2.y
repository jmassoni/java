{ Nested for loops }

program optional_for_2:

    for outer := 1 to 5:

        { The starting value for the inner loop is controlled by a variable }
        for inner := outer to 5:
            print inner
        end
    end
end
