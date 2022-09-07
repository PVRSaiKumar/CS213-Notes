#for i in 200:
#    print(i)
#we can't iterate int object

list1 = [1,2,3]
for i in list1:
    i = i*i
print(list1)            #[1, 2, 3]

for i in range(len(list1)):
    list1[i] *= list1[i]
print(list1)            #[1, 4, 9]