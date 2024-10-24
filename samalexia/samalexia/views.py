from django.shortcuts import render

def index(request):
    return render(request,'index.html',{
        #context
    })
def login(request):
    return render(request,'login.html',{
        #context
    })
def landingPage(request):
    return render(request,'landingPage.html',{
        #context
    })