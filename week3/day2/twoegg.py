def my_function(arg):

    # Write the body of your function here
    a=arg
    count=0
    c=14
    b=0
    while(b<a):
            x=b
            b=b+c
            c=c-1
            count=count+1
    if(a==b):
        return count
    count=count+(a-x)
    return count

    # return 'running with %s' % arg

# Run your function through some test cases here
# Remember: debugging is half the battle!
# print my_function('test input')
for i in range(1,100):
    print(my_function(i))
