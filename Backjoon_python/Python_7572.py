#간지
gan = '0123456789'
ji = 'ABCDEFGHIJKL'
idx = int(input()) - 2013
print(ji[(idx+5)%12]+gan[(idx-1)%10])