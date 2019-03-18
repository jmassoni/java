program optional_sub_1:

    { Define subroutine }
    sub hello():
        print "Hello"
    end

    { Call subroutine }
    { A call starts with a name, like an assign statement }
    { You can distinguish a call from an assign by looking at the token after
      the name. }
    hello()
end