s1 = {'abc',2,3,3}
print(s1)           #{2, 3, 'abc'}
s2 = {3,4,5}
s3 = s1|s2          #{2,3,4,5,'abc'}
#union operation
s4 = s1 & s2        #{3}
#intersection
s5 = s1-s2          #{2, 'abc'}
#difference
s6 = s1^s2          #{2, 'abc', 4, 5}
#symmetric difference
s6.pop()            #{'abc', 4, 5}
#removes random element
s6.add(1)            #{1, 'abc', 4, 5}
#adds the element in bracket
s6.discard(4)        #removes that particular element
print(s6)
s6.clear()          #set()
#removes all elements
