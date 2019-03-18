program optional_sub_2:

    sub print_twice():
        print "this"
        print "this"
    end

    sub print_four_times():
        print_twice()
        print_twice()
    end

    print_four_times()
end