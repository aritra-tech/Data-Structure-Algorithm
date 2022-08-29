
#include <assert.h>
#include <limits.h>
#include <math.h>
#include <stdbool.h>
#include <stdio.h>
#include <stdlib.h>
#include <string.h>

char* readline();
typedef struct LinkedListNode LinkedListNode;

struct LinkedListNode {
    int val;
    LinkedListNode* prev;
    LinkedListNode* next;
};

LinkedListNode* _insert_node_into_doublylinkedlist(LinkedListNode *head, LinkedListNode *tail, int val) {
    if (!head) {
        head = malloc(sizeof(LinkedListNode));

        head->val = val;
        head->prev = NULL;
        head->next = NULL;

        tail = head;
    } else {
        LinkedListNode *node = malloc(sizeof(LinkedListNode));

        node->val = val;
        node->prev = tail;
        node->next = NULL;

        tail->next = node;
        tail = tail->next;
    }

    return tail;
}



//-------------------- body of the code ------------------------

/*
 * Complete the function below.
 */
/*
For your reference:
LinkedListNode {
    int val;
    LinkedListNode* prev;
    LinkedListNode* next;
};
*/
LinkedListNode* disintegrate(LinkedListNode* head, int k) 
{
    if(k == head->val)
    {
        LinkedListNode *ptr = head;
        head = head->next;
        if(head != NULL)
            head->prev = NULL;
        free(ptr);
    }
    else
    {
        LinkedListNode *current = head, *oldNode = head, *temp;
        while(current->val != k)
        {
            temp = current->next;
            current->next = current->prev;
            current->prev = temp;
            current = temp;
        }
        head = current->prev;
        current = current->next;
        oldNode->next = current;
        if(current != NULL)
            current->prev = oldNode;
    }
    return head;
}


//-------------------- tail of the code ------------------------

int main()
{
    FILE *f = fopen(getenv("OUTPUT_PATH"), "w");

    char* head_size_endptr;
    char* head_size_str = readline();
    int head_size = strtol(head_size_str, &head_size_endptr, 10);

    if (head_size_endptr == head_size_str || *head_size_endptr != '\0') { exit(EXIT_FAILURE); }

    LinkedListNode* head = NULL;
    LinkedListNode* head_tail = NULL;

    for (int head_i = 0; head_i < head_size; head_i++) {
        char* head_item_endptr;
        char* head_item_str = readline();
        int head_item = strtol(head_item_str, &head_item_endptr, 10);

        if (head_item_endptr == head_item_str || *head_item_endptr != '\0') { exit(EXIT_FAILURE); }
        head_tail = _insert_node_into_doublylinkedlist(head, head_tail, head_item);

        if (!head_i) {
            head = head_tail;
        }
    }

    char* k_endptr;
    char* k_str = readline();
    int k = strtol(k_str, &k_endptr, 10);

    if (k_endptr == k_str || *k_endptr != '\0') { exit(EXIT_FAILURE); }

    LinkedListNode* res = disintegrate(head, k);

    while (res) {
        fprintf(f, "%d", res->val);

        if (res->next) {
            fprintf(f, "\n");
        }

        res = res->next;
    }

    fprintf(f, "\n");


    fclose(f);

    return 0;
}

char* readline() {
    size_t alloc_length = 1024;
    size_t data_length = 0;
    char* data = malloc(alloc_length);

    while (true) {
        char* cursor = data + data_length;
        char* line = fgets(cursor, alloc_length - data_length, stdin);

        if (!line) { break; }

        data_length += strlen(cursor);

        if (data_length < alloc_length - 1 || data[data_length - 1] == '\n') { break; }

        size_t new_length = alloc_length << 1;
        data = realloc(data, new_length);

        if (!data) { break; }

        alloc_length = new_length;
    }

    if (data[data_length - 1] == '\n') {
        data[data_length - 1] = '\0';
    }

    data = realloc(data, data_length);

    return data;
}