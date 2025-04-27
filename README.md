# HashTable Implementation in Java

This project demonstrates the implementation of a basic HashTable in Java using Linked List for collision handling (separate chaining).

## Features

- **Set**: Insert key-value pairs into the hash table.
- **Get**: Retrieve the value associated with a given key.
- **Keys**: Retrieve all the keys present in the hash table.
- **Print Table**: Print the contents of the hash table for debugging purposes.

## Methods Explained

### `set(String key, int value)`

- **Purpose**: Insert a key-value pair into the hash table.
- **Parameters**:
    - `key`: The key to be inserted.
    - `value`: The value associated with the key.

### `get(String key)`

- **Purpose**: Retrieve the value associated with a key.
- **Parameters**:
    - `key`: The key whose value is to be fetched.
- **Returns**: The value associated with the key, or `0` if the key does not exist in the hash table.

### `keys()`

- **Purpose**: Retrieve all the keys present in the hash table.
- **Returns**: An `ArrayList<String>` containing all the keys.

### `printTable()`

- **Purpose**: Print the contents of the hash table, useful for debugging.
- **Returns**: Prints out all keys and values in the hash table.

## Internal Implementation Details

- **Hash Function**:  
  A custom hash function is used to generate an index based on the ASCII values of characters in the string key. The hash function uses a prime number (23) for better distribution and reduces collisions.

- **Collision Handling**:  
  The hash table uses **Separate Chaining** (linked lists) to handle collisions. Each index of the hash table points to a linked list that contains nodes of key-value pairs.

## How to Run

1. Clone the repository:
    ```bash
    git clone https://github.com/your-username/HashTable.git
    ```

2. Navigate into the project:
    ```bash
    cd HashTable
    ```

3. Compile and run the program:
    ```bash
    javac HashTable.java
    java HashTable
    ```

## Example Output

```plaintext
0:
{apple, 100}
{banana, 200}
1:
{grape, 300}
2:
{pear, 400}
3:
{orange, 500}
...
