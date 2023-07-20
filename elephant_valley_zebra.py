#1
def better_health(): 
    healthy_diet = 'Eat plenty of fruits and vegetables'
    exercise = 'Exercise for at least 30 minutes daily'
    sleep = 'Get regular sleep of 7-9 hours per night'
    hydration = 'Stay hydrated with 8-10 glasses of water daily'
    mental_health = 'Practice positive mental health activities like meditation and mindfulness'
   
    print("Here are some simple tips to help you start Building Better Health: \n")
    print(healthy_diet + "\n" + exercise + "\n" + sleep + "\n" + hydration + "\n" + mental_health + "\n")

#2
def add_tip(): 
    tip = input("Do you have another tip for Building Better Health? \n")
    if tip != '':
        print("Thanks for adding your tip! \n")
        with open('better_health_tips.txt', 'a') as f:
            f.write("\n" + tip)
    else:
        print("No problem - keep Building Better Health!")

#3
def read_tips():
    with open('better_health_tips.txt', 'r') as f:
        tips = f.read()
        print(tips)

#4
def main(): 
    better_health()
    add_tip()
    read_tips()

#5
if __name__ == "__main__":
    main()