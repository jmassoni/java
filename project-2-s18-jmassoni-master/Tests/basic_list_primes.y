{ List prime numbers }

program basic_list_primes:

    n := 2

    while n < 100:

        i := 2
        is_prime := 1  { Assume n is prime until we prove otherwise }

        { Looping to sqrt(n) would be enough, but we'd need a sqrt function }
        while i < n:

            { Test if n is divisible by i }
            if n % i = 0:
                is_prime := 0
                i := n + 1
            end

            i := i + 1
        end

        if is_prime = 1:
            print n
        end

        n := n + 1
    end
end
