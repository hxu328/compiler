	.data
	.align 2
_a:	.space 4	# Global Variable Declaratioin
	.data
	.align 2
_b:	.space 4	# Global Variable Declaratioin
	.text
	.globl main
main:		# Function Entry
	sw    $ra, 0($sp)	# PUSH
	subu  $sp, $sp, 4
	sw    $fp, 0($sp)	# PUSH
	subu  $sp, $sp, 4
	addu  $fp, $sp, 8
	subu  $sp, $sp, 12
			# ASSIGN
	la    $t0, -16($fp)	# Load local var addr: t3
	sw    $t0, 0($sp)	# PUSH
	subu  $sp, $sp, 4
			# Push int on stack
	li    $t0, 3
	sw    $t0, 0($sp)	# PUSH
	subu  $sp, $sp, 4
	lw    $t1, 4($sp)	# POP
	addu  $sp, $sp, 4
	lw    $t0, 4($sp)	# POP
	addu  $sp, $sp, 4
	sw    $t1, 0($t0)	# Store rhs to lhs
	sw    $t1, 0($sp)	# PUSH
	subu  $sp, $sp, 4
	lw    $t0, 4($sp)	# POP
	addu  $sp, $sp, 4
			# ASSIGN
	la    $t0, -12($fp)	# Load local var addr: t2
	sw    $t0, 0($sp)	# PUSH
	subu  $sp, $sp, 4
			# Push bool(false) on stack
	li    $t0, 0
	sw    $t0, 0($sp)	# PUSH
	subu  $sp, $sp, 4
	lw    $t1, 4($sp)	# POP
	addu  $sp, $sp, 4
	lw    $t0, 4($sp)	# POP
	addu  $sp, $sp, 4
	sw    $t1, 0($t0)	# Store rhs to lhs
	sw    $t1, 0($sp)	# PUSH
	subu  $sp, $sp, 4
	lw    $t0, 4($sp)	# POP
	addu  $sp, $sp, 4
			# ASSIGN
	la    $t0, -8($fp)	# Load local var addr: t1
	sw    $t0, 0($sp)	# PUSH
	subu  $sp, $sp, 4
			# Push int on stack
	li    $t0, 1
	sw    $t0, 0($sp)	# PUSH
	subu  $sp, $sp, 4
	lw    $t1, 4($sp)	# POP
	addu  $sp, $sp, 4
	lw    $t0, 4($sp)	# POP
	addu  $sp, $sp, 4
	sw    $t1, 0($t0)	# Store rhs to lhs
	sw    $t1, 0($sp)	# PUSH
	subu  $sp, $sp, 4
	lw    $t0, 4($sp)	# POP
	addu  $sp, $sp, 4
			# WRITE
			# Enter OrNode
			# Push bool(true) on stack
	li    $t0, 1
	sw    $t0, 0($sp)	# PUSH
	subu  $sp, $sp, 4
	lw    $t0, 4($sp)	# POP
	addu  $sp, $sp, 4
	li    $t1, 0
	bne   $t0, $t1, .L0		# OrNode: evaluate lhs first
			# Push bool(true) on stack
	li    $t0, 1
	sw    $t0, 0($sp)	# PUSH
	subu  $sp, $sp, 4
	b     .L1
.L0:
	sw    $t0, 0($sp)	# PUSH
	subu  $sp, $sp, 4
.L1:
	lw    $a0, 4($sp)	# POP
	addu  $sp, $sp, 4
	li    $v0, 1
	syscall
			# WRITE
	.data
.L2:	.asciiz "\n"	# String Declaration
	.text
	la    $t0, .L2
	sw    $t0, 0($sp)	# PUSH
	subu  $sp, $sp, 4
	lw    $a0, 4($sp)	# POP
	addu  $sp, $sp, 4
	li    $v0, 4
	syscall
			# WRITE
			# Enter OrNode
			# Push bool(true) on stack
	li    $t0, 1
	sw    $t0, 0($sp)	# PUSH
	subu  $sp, $sp, 4
	lw    $t0, 4($sp)	# POP
	addu  $sp, $sp, 4
	li    $t1, 0
	bne   $t0, $t1, .L3		# OrNode: evaluate lhs first
			# Push bool(false) on stack
	li    $t0, 0
	sw    $t0, 0($sp)	# PUSH
	subu  $sp, $sp, 4
	b     .L4
.L3:
	sw    $t0, 0($sp)	# PUSH
	subu  $sp, $sp, 4
.L4:
	lw    $a0, 4($sp)	# POP
	addu  $sp, $sp, 4
	li    $v0, 1
	syscall
			# WRITE
	.text
	la    $t0, .L2
	sw    $t0, 0($sp)	# PUSH
	subu  $sp, $sp, 4
	lw    $a0, 4($sp)	# POP
	addu  $sp, $sp, 4
	li    $v0, 4
	syscall
			# WRITE
			# Enter OrNode
			# Push bool(false) on stack
	li    $t0, 0
	sw    $t0, 0($sp)	# PUSH
	subu  $sp, $sp, 4
	lw    $t0, 4($sp)	# POP
	addu  $sp, $sp, 4
	li    $t1, 0
	bne   $t0, $t1, .L5		# OrNode: evaluate lhs first
			# Push bool(false) on stack
	li    $t0, 0
	sw    $t0, 0($sp)	# PUSH
	subu  $sp, $sp, 4
	b     .L6
.L5:
	sw    $t0, 0($sp)	# PUSH
	subu  $sp, $sp, 4
.L6:
	lw    $a0, 4($sp)	# POP
	addu  $sp, $sp, 4
	li    $v0, 1
	syscall
			# WRITE
	.text
	la    $t0, .L2
	sw    $t0, 0($sp)	# PUSH
	subu  $sp, $sp, 4
	lw    $a0, 4($sp)	# POP
	addu  $sp, $sp, 4
	li    $v0, 4
	syscall
			# WRITE
			# Enter OrNode
			# Push bool(false) on stack
	li    $t0, 0
	sw    $t0, 0($sp)	# PUSH
	subu  $sp, $sp, 4
	lw    $t0, 4($sp)	# POP
	addu  $sp, $sp, 4
	li    $t1, 0
	bne   $t0, $t1, .L7		# OrNode: evaluate lhs first
			# Push bool(true) on stack
	li    $t0, 1
	sw    $t0, 0($sp)	# PUSH
	subu  $sp, $sp, 4
	b     .L8
.L7:
	sw    $t0, 0($sp)	# PUSH
	subu  $sp, $sp, 4
.L8:
	lw    $a0, 4($sp)	# POP
	addu  $sp, $sp, 4
	li    $v0, 1
	syscall
			# WRITE
	.text
	la    $t0, .L2
	sw    $t0, 0($sp)	# PUSH
	subu  $sp, $sp, 4
	lw    $a0, 4($sp)	# POP
	addu  $sp, $sp, 4
	li    $v0, 4
	syscall
_main_Exit:		# Function Exit
	lw    $ra, 0($fp)	# Restore return address
	move  $t0, $fp		# Restore frame pointer
	lw    $fp, -4($fp)
	move  $sp, $t0		# Restore stack pointer
	li    $v0, 10
	syscall
