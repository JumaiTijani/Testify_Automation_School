
import main
import unittest

class TestMain(unittest.TestCase):
    
    def test_addition(self):
        self.assertEqual(main.adddition(1, 2), 3, "should be 3")
        self.assertEqual(main.adddition(5, 5), 10, "should be 10")
        self.assertEqual(main.adddition(-3, 2), -1, "should be -1")

        If __name__ == '__main__':
        unittest.main()

        