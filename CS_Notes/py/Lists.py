list1 = [11,12,13,14]
list2 = [21,22,23]
print(len(list1))           #4
list3 = list1+list2
print(list3)                #[11,12,13,14,21,22,23]
#list3 = list1-list2        #error no such operand
list3.append(24)
print(list3)                #[11,12,13,14,21,22,23,24]
list3.pop()                 #removes last element
print(list3)                #[11,12,13,14,21,22,23]
list3.pop(-2)               #removes from last, last element is -1
print(list3)                #[11,12,13,14,21,23]
list3.pop(3)                #removes that indexed element, first element is 0
print(list3)                #[11,12,13,21,23]
list3.remove(12)            #removes that particular element(not by index)
#if there are many elements with same value, then only first value is removed
print(list3)                #[11,13,21,23]

#List Slicing
list3 = [0,1,4,9,16,25,36,49,64,81]
list4 = list3[1:]
print(list4)                #[1, 4, 9, 16, 25, 36, 49, 64, 81]
list4 = list3[1::]
print(list4)                #[1, 4, 9, 16, 25, 36, 49, 64, 81]
list4 = list3[1:11]
print(list4)                #[1, 4, 9, 16, 25, 36, 49, 64, 81]
list4 = list3[:4]
print(list4)                #[0, 1, 4, 9]
list4 = list3[:4:]
print(list4)                #[0, 1, 4, 9]
list4 = list3[1:4]
print(list4)                #[1, 4, 9]
list4 = list3[1:4:]
print(list4)                #[1, 4, 9]
#so there is no use if you use ":"after first 2 numbers if it is not 1
list4 = list3[::2]
print(list4)                #[0, 4, 16, 36, 64]
list4 = list3[:5:2]
print(list4)                #[0, 4, 16]
list4 = list3[2::2]
print(list4)                #[4, 16, 36, 64]

#sorting of a list
list_ = [3,4,2,5,1]
list_.sort()
print(list_)                #[1, 2, 3, 4, 5]

#reversing a list
list_.reverse()
print(list_)                #[5, 4, 3, 2, 1]