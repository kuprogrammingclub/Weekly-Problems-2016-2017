## C++

```
$ make
$ ./main
```

## Python

### Unit Testing

I wrote some [unit tests](https://en.wikipedia.org/wiki/Unit_testing) since most of you probably haven't had exposure
to them and won't during your time at KU.<br>

Knowing how to write unit tests is a __VERY__ valuable skill and you will almost certainly be writing them at whatever
company you end up at.

So learn it early! :)

__NOTE:__ This is assuming you're using a Mac.

```
$ python3 --version
Python 3.5.2
```

If it's not installed and [Homebrew](http://brew.sh/) isn't installed:

```
$ /usr/bin/ruby -e "$(curl -fsSL https://raw.githubusercontent.com/Homebrew/install/master/install)"
```

I used the [Nose](http://nose.readthedocs.io/en/latest/) unit testing framework, but Python has a
[built-in unit testing module](https://docs.python.org/3/library/unittest.html) that you could also use.<br>

To run the tests:
```
# Create the virtual environment
$ pyvenv venv

# "Turn on" the virtual environment
$ source venv/bin/activate

# Install the dependencies (only Nose)
$ pip install -r requirements.txt

# Run the unit tests
(venv) $ nosetests

# Run the program
(venv) $ python3 python/implementation/Intermediate2.py

# "Turn off" the virtual environment
(venv) $ deactivate
```

### Without Unit Testing

To run the Python code:
```
$ python3 python/implementation/Intermediate2.py
```
