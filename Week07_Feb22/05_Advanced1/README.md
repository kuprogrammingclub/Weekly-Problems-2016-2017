## Advanced 1 - Magic Spells

__source__:
https://www.hackerrank.com/challenges/magic-spells

### Author
[Dalimil](https://www.hackerrank.com/Dalimil)


### Description

You are battling a powerful dark wizard. He casts his spells from a distance,
giving you only a few seconds to react and conjure your counterspells. For a counterspell to be effective, you must first identify what kind of spell you
are dealing with.

The wizard uses scrolls to conjure his spells, and sometimes he uses some of
his generic spells that restore his stamina. In that case, you will be able to extract the name of the scroll from the spell. Then you need to find out how
similar this new spell is to the spell formulas written in your spell journal.

Spend some time reviewing the locked code in your editor, and complete the body
of the counterspell function.

#### Input format

The wizard will read *T* scrolls, which are hidden from you.
Every time he casts a spell, it's passed as an argument to your counterspell function.

#### Constraints

* 1 <= *T* <= 100
* 1 <= | *S* | <= 1000, where *S* is a scroll name.
* Each scroll name, *S*, consists of uppercase and lowercase letters.

### Output format

After identifying the given spell, print its name and power.
If it is a generic spell, find a subsequence of letters that are contained in  both the spell name and your spell journal. Among all such subsequences, find
and print the length of the longest one on a new line.

### Sample Input

```
3
fire 5
AquaVitae 999 AruTaVae
frost 7
```

### Sample Output

```
Fireball: 5
6
Frostbite: 7
```

### Explanation

Fireball and Frostbite are common spell types.
AquaVitae is not, and when you compare it with AruTaVae in your spell journal, you get a sequence: AuaVae

### Code to be used/edited

```
#include <iostream>
#include <vector>
#include <string>
using namespace std;

class Spell {
    private:
        string scrollName;
    public:
        Spell(): scrollName("") { }
        Spell(string name): scrollName(name) { }
        virtual ~Spell() { }
        string revealScrollName() {
            return scrollName;
        }
};

class Fireball : public Spell {
    private: int power;
    public:
        Fireball(int power): power(power) { }
        void revealFirepower(){
            cout << "Fireball: " << power << endl;
        }
};

class Frostbite : public Spell {
    private: int power;
    public:
        Frostbite(int power): power(power) { }
        void revealFrostpower(){
            cout << "Frostbite: " << power << endl;
        }
};

class Thunderstorm : public Spell {
    private: int power;
    public:
        Thunderstorm(int power): power(power) { }
        void revealThunderpower(){
            cout << "Thunderstorm: " << power << endl;
        }
};

class Waterbolt : public Spell {
    private: int power;
    public:
        Waterbolt(int power): power(power) { }
        void revealWaterpower(){
            cout << "Waterbolt: " << power << endl;
        }
};

class SpellJournal {
    public:
        static string journal;
        static string read() {
            return journal;
        }
};
string SpellJournal::journal = "";

void counterspell(Spell *spell) {




    /* Enter Code here */




}

class Wizard {
    public:
        Spell *cast() {
            Spell *spell;
            string s; cin >> s;
            int power; cin >> power;
            if(s == "fire") {
                spell = new Fireball(power);
            }
            else if(s == "frost") {
                spell = new Frostbite(power);
            }
            else if(s == "water") {
                spell = new Waterbolt(power);
            }
            else if(s == "thunder") {
                spell = new Thunderstorm(power);
            }
            else {
                spell = new Spell(s);
                cin >> SpellJournal::journal;
            }
            return spell;
        }
};

int main() {
    int T;
    cin >> T;
    Wizard Arawn;
    while(T--) {
        Spell *spell = Arawn.cast();
        counterspell(spell);
    }
    return 0;
}
```





### Furthermore
If you're looking for inspiration on a language to use, here's a basic tutorial
for [Java](http://www.codeproject.com/Articles/2853/Java-Basics-Input-and-Output)
and [C++](http://www.cplusplus.com/doc/tutorial/basic_io/).<br>
If you check out the README under the Weekly-Problems-2016-2017 there are many
more resources available to start learning different languages!
